import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String privacy;
	public String schedule_published_on;
	public String name;
	public String type;
	public String end_time;
	public String state;
	public String organizer_description;
	public int id;
	public String topic;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String email;

	public RootModel(Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String privacy, String schedule_published_on, String name, String type, String end_time, String state, String organizer_description, int id, String topic, String start_time, String timezone, String organizer_name, String code_of_conduct, CopyrightModel copyright, String location_name, String background_image, String description, VersionModel version, String email) {

		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.type = type;
		this.end_time = end_time;
		this.state = state;
		this.organizer_description = organizer_description;
		this.id = id;
		this.topic = topic;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.email = email;

	}

}