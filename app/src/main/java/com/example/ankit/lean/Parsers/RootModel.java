import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String type;
	public String name;
	public String organizer_name;
	public String email;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public String end_time;
	public String background_image;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public String state;
	public String privacy;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String logo, String type, String name, String organizer_name, String email, CreatorModel creator, String description, String code_of_conduct, String end_time, String background_image, int id, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, String location_name, CopyrightModel copyright, String start_time, String topic, String schedule_published_on, String state, String privacy, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.type = type;
		this.name = name;
		this.organizer_name = organizer_name;
		this.email = email;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.background_image = background_image;
		this.id = id;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.privacy = privacy;
		this._version = version;

	}

}