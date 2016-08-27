import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String code_of_conduct;
	public String background_image;
	public String organizer_name;
	public String start_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String name;
	public int id;
	public String email;
	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String timezone;
	public String privacy;
	public String description;
	public String schedule_published_on;
	public String type;

	public RootModel(String location_name, String organizer_description, String end_time, Call_for_papersModel call_for_papers, VersionModel version, String code_of_conduct, String background_image, String organizer_name, String start_time, String logo, ArrayList<Social_linksModel> social_links, String topic, String name, int id, String email, String state, CopyrightModel copyright, CreatorModel creator, String timezone, String privacy, String description, String schedule_published_on, String type) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;
		this.social_links = social_links;
		this.topic = topic;
		this.name = name;
		this.id = id;
		this.email = email;
		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this.timezone = timezone;
		this.privacy = privacy;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;

	}

}