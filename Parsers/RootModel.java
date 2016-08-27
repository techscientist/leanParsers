import java.util.ArrayList;

class RootModel {

	public int id;
	public String schedule_published_on;
	public String topic;
	public String description;
	public String end_time;
	public String logo;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String state;
	public String name;
	public String start_time;
	public String organizer_description;
	public String email;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(int id, String schedule_published_on, String topic, String description, String end_time, String logo, CopyrightModel copyright, VersionModel version, String type, String state, String name, String start_time, String organizer_description, String email, String location_name, CreatorModel creator, String organizer_name, String code_of_conduct, String timezone, String background_image, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String privacy) {

		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.logo = logo;
		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.state = state;
		this.name = name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.email = email;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.background_image = background_image;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}