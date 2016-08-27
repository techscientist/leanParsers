import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_description;
	public String timezone;
	public VersionModel _version;
	public String description;
	public CopyrightModel _copyright;
	public String email;
	public String schedule_published_on;
	public String end_time;
	public String type;
	public String name;
	public String state;
	public String start_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String background_image;
	public String topic;

	public RootModel(String code_of_conduct, int id, ArrayList<Social_linksModel> social_links, String privacy, String location_name, CreatorModel creator, String organizer_description, String timezone, VersionModel version, String description, CopyrightModel copyright, String email, String schedule_published_on, String end_time, String type, String name, String state, String start_time, String logo, Call_for_papersModel call_for_papers, String organizer_name, String background_image, String topic) {

		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._version = version;
		this.description = description;
		this._copyright = copyright;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.type = type;
		this.name = name;
		this.state = state;
		this.start_time = start_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.topic = topic;

	}

}