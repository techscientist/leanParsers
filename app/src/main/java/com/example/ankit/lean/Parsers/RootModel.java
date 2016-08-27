import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_name;
	public String background_image;
	public String topic;
	public String logo;
	public String timezone;
	public String type;
	public String description;
	public String start_time;
	public String state;
	public String end_time;
	public int id;
	public String code_of_conduct;
	public String schedule_published_on;
	public String email;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, String location_name, String privacy, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String name, String organizer_name, String background_image, String topic, String logo, String timezone, String type, String description, String start_time, String state, String end_time, int id, String code_of_conduct, String schedule_published_on, String email, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.name = name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.topic = topic;
		this.logo = logo;
		this.timezone = timezone;
		this.type = type;
		this.description = description;
		this.start_time = start_time;
		this.state = state;
		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._version = version;

	}

}